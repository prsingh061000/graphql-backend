# graphql-backend

API Endpoint : https://graphql-backend-dr4o.onrender.com/graphql

Requests :

1. Fetch All Books :

  ```graphql
query{
  allBooks{
    id
    title
    desc
    price
  }
}
```
2. Fetch Book By ID :
  ```graphql
query{
  getBook(bookId: 50){
    id
    title
    desc
    price
  }
}
```

3. Save a Book
```graphql
mutation{
    createBook(book : {
    title: "How to Win Friends and Influence People",
    desc: "A self-help book offering practical advice and techniques for how to get out of a mental rut and make life more rewarding.",
    author: "Dale Carnegie",
    price: 800.0,
    pages: 288
}){
        id,
        title
    }
}
```
