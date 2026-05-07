package manajemenproduk;

import java.util.Stack;

public class ProductStack {

    Stack<Product> stack = new Stack<>();

    // tambah produk
    public void tambahProduk(Product p) {
        stack.push(p);
        System.out.println("DEBUG: Produk ditambahkan");
    }

    // hapus produk
    public Product hapusProduk() throws Exception {

        if (stack.isEmpty()) {
            throw new Exception("Stok produk kosong!");
        }

        System.out.println("DEBUG: Produk dihapus");
        return stack.pop();
    }

    // tampil data
    public Stack<Product> getStack() {
        return stack;
    }
}