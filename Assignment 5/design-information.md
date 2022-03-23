1. As a user of the system I want to be able to see each store's offering and the amount of product in stock by square feet.

   ​	This was done through the class User with methods: seeProductAmount(), searchProductByName().

2. The application must allow employees to add new products to the system. As well as delete and edit them.

   ​	This was achieved with the class Employees, and the methods: addProducts(), editProducts(), and deleteProducts().

3. The different categories of floors available are tile, stone, wood, laminate and vinyl

4. The application must contain a database (DB) of floors.

   ​	N/A

5. Users must be able to search for products by picking from a hierarchical list, where the first level is the floor category, and the second level is the floor type.

   ​	This was done under the class User, where the methods are: searchProductByFloorCategory() and searchProductByFloorType()

6. Users must also be able to specify an item by typing its name (search functionality).

   ​	This is done through the class User, where method seeStore is used

7. All floors regardless of their category have an associated color, size, brand, type and price

   ​	This is done under Class Floor with methods being type as a string, price as a double, color as a string, size as a double, and brand as a string

8. Categories tile and stone have different materials they are made of, e.g. Tile - porcelain, ceramic, resin; Stone - marble, pebble, slate

9. Wood floors have both a type (solid, engineered, bamboo, etc) and species (oak, hickory, maple, etc.)

10.  Laminate can be regular laminate or water resistant, whereas vinyl can be water resistant or waterproof

11. Not considered because it does not affect the design directly.

