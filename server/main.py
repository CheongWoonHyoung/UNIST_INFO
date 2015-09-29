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
        cursor = db.execute("INSERT INTO `announce` (`title`, `content`) " +
                            "VALUES ('" + request.form['title'] +
                            "', '" + request.form['content'] + "');")
        cursor.close()
        return '{result:"success"}'

    #cursor = db.execute("SELECT * FROM `announce`;")
    #data = cursor.fetchall()
    #print data
    #json.dumps(data)

    # GET : 공지사항 작성하기
    return render_template('announce.html')

def get_json(cursor):
    return json.dumps([ dict(line) for line in [zip([ column[0] for column in
                     cursor.description], row) for row in cursor.fetchall()] ])

if __name__ == '__main__':
    init_server()
    app.debug = True
    app.run(host='0.0.0.0')
