

# Spring Boot CRUD application using JPA and H2 Database

>RestControllers

> Dao Layer as JPA

> H2 As Database

---

## Table of Contents (Optional)

> If your `README` has a lot of info, section headers might be nice.

- [Installation](#installation)
- [Features](#features)
- [Contributing](#contributing)
- [FAQ](#faq)
- [Support](#support)
- [License](#license)


Test:

Validator : checking request for numeric id.

ENDPOINTS : /api/userdetails  (Post Mapping to add)
api/userdetails/{id}  (Get Mapping to retrieve)

POST : (Addition)

{
  "id": 8,
  
  "title": "MR",
  
  "firstName": "Derick",
  
  "lastName": "Pinto",
  
  "gender": "M",
  
  "address" :
         {    
                "id" : 8,
		
                "street" : "elizabeth",
		
                "city" : "sydney",
		
                "postCode" : 2148,
		
                "state" : "nsw"                 
          }
}
