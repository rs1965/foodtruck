#### Food Truck Service
## Food Truck Service implemented using Springboot & jdk 17 on Intellij IDE

## Service returns all food trucks
`
curl --location --request GET 'localhost:8080/foodtrucks' \
--header 'Content-Type: application/json'
`
## Service returns APPROVED food trucks

`
curl --location --request GET 'localhost:8080/foodtrucks?status=APPROVED' \
--header 'Content-Type: application/json' 
`
## Service returns 404 

`
curl --location --request GET 'localhost:8080/foodtrucks?status=INVALID' \
--header 'Content-Type: application/json'
`

# foodtruck
