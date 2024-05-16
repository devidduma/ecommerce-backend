# E-Commerce Backend

E-Commerce application backend for online shopping of books, coffee mugs, mouse pads and luggage tags.

### Frontend module

This project is the backend module.

The frontend module that consumes the API of this backend can be found under [devidduma/ecommerce-frontend](https://github.com/devidduma/ecommerce-frontend).

### Backend API

1. Run the project in your favourite IDE.
2. In the web browser, navigate to ```localhost:8080/api``` to show the available API of this project.

The available API of this project is presented below:
```
{
  "_links" : {
    "countries" : {
      "href" : "http://localhost:8080/api/countries{?page,size,sort}",
      "templated" : true
    },
    "products" : {
      "href" : "http://localhost:8080/api/products{?page,size,sort}",
      "templated" : true
    },
    "customer" : {
      "href" : "http://localhost:8080/api/customer{?page,size,sort}",
      "templated" : true
    },
    "productCategory" : {
      "href" : "http://localhost:8080/api/product-category{?page,size,sort}",
      "templated" : true
    },
    "states" : {
      "href" : "http://localhost:8080/api/states{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/api/profile"
    }
  }
}
```