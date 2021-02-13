package com.temzu.servlets;

import com.temzu.entries.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(ProductServlet.class);

    private List<Product> productList;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOG.debug("LOG: GET");
        Writer writer = resp.getWriter();
        int id = 1;
        writer.write(String.format("%-3s %-10s %s \n\n", "id", "title", "cost"));
        for (Product product : productList)
            writer.write(product + "\n");
    }

    @Override
    public void destroy() {
        LOG.debug("Destroy");
    }

    @Override
    public void init() throws ServletException {
        LOG.debug("Init");
        productList = new ArrayList<>();
        productList.add(new Product(1, "Milk", 50));
        productList.add(new Product(2, "Meat", 200));
        productList.add(new Product(3, "Watter", 30));
        productList.add(new Product(4, "Fish", 1500));
        productList.add(new Product(5, "Egg", 62));
        productList.add(new Product(6, "Tea", 120));
        productList.add(new Product(7, "Rice", 73));
        productList.add(new Product(8, "Cabbage", 22));
        productList.add(new Product(9, "Apple", 100));
        productList.add(new Product(10, "Orange", 90));
    }
}
