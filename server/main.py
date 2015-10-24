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
    return render_template('list.html', data = cursor.fetchall())

@app.route('/delete/<id>', methods=['GET'])
def delete(id):
    cursor = db.execute("DELETE FROM `announce` WHERE `id`=" + id + ";")
    return u'삭제하였습니다.'

@app.template_global()
def get_length(item):
    return len(item)

if __name__ == '__main__':
    init_server()
    app.debug = True
    app.run(host='0.0.0.0')
