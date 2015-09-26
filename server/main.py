# -*- coding: utf-8 -*-

from app import *
from database import db

@app.route('/')
def index():
    return "hi"

@app.route('/announce/', methods=['POST', 'GET'])
def announce():
    # POST : 글 작성
    if request.method == 'POST':
        return ""

    # GET : 글 가져오기
    #cursor = db.execute("SELECT * FROM `announce`;")
    #data = cursor.fetchall()
    ##print data
    return render_template('announce.html')#json.dumps(data)

def get_json(cursor):
    return json.dumps([ dict(line) for line in [zip([ column[0] for column in
                     cursor.description], row) for row in cursor.fetchall()] ])

if __name__ == '__main__':
    init_server()
    app.debug = True
    app.run(host='0.0.0.0')
