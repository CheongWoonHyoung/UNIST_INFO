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

    # GET : 공지사항 작성하기
    return render_template('announce.html')

@app.route('/list/', methods=['GET'])
def list():
    cursor = db.execute("SELECT * FROM `announce`;")
    data = json.dumps(cursor.fetchall())

    return data

if __name__ == '__main__':
    init_server()
    app.debug = True
    app.run(host='0.0.0.0')
