# jpa_one_to_one_mapping
This project demonstrates spring data JPA one to one mapping

Here there are two entities as Student and Address. Student is the parent entity and Address is the child entity.
Among Student and Address there is a one to one relationship. Here I have mapped that relationship as a bidirectional  relationship.
For testing these relationsip I have added  below mappings inside a rest controller called TestResource.

1.Save data     ->  @GetMapping("/save")          
2.Retrieve student data ->  @GetMapping("/retrieve")
3.Retrieve address data ->  @GetMapping("/retrieveChild")   
4.Update data   ->  @GetMapping("/update")      
5.Delete data   ->  @GetMapping("/delete")      

