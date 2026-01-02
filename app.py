from flask import Flask, render_template, request, redirect
import sqlite3

app = Flask(__name__)

# دالة مساعدة لفتح اتصال مع قاعدة البيانات
def get_db_connection():
    conn = sqlite3.connect("products.db")
    conn.row_factory = sqlite3.Row  # يخلي النتائج مثل dict
    return conn

# 1️⃣ عرض المنتجات
@app.route("/")
def list_products():
    conn = get_db_connection()
    products = conn.execute("SELECT * FROM products").fetchall()
    conn.close()
    return render_template("list.html", products=products)

# 2️⃣ تفاصيل منتج
@app.route("/details/<int:id>")
def details(id):
    conn = get_db_connection()
    product = conn.execute("SELECT * FROM products WHERE id = ?", (id,)).fetchone()
    conn.close()
    return render_template("details.html", product=product)

# 3️⃣ إضافة منتج
@app.route("/add", methods=["GET", "POST"])
def add():
    if request.method == "POST":
        name = request.form["name"]
        price = request.form["price"]
        description = request.form["description"]
        image = request.form["image"]

        conn = get_db_connection()
        conn.execute(
            "INSERT INTO products (name, price, description, image) VALUES (?, ?, ?, ?)",
            (name, price, description, image)
        )
        conn.commit()
        conn.close()

        return redirect("/")  # يرجع لواجهة عرض المنتجات
    return render_template("add.html")

# 4️⃣ (اختياري) حذف منتج
@app.route("/delete/<int:id>")
def delete(id):
    conn = get_db_connection()
    conn.execute("DELETE FROM products WHERE id = ?", (id,))
    conn.commit()
    conn.close()
    return redirect("/")

if __name__ == "__main__":
    app.run(debug=True)
