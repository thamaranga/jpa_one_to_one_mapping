# jpa_one_to_one_mapping
This project demonstrates spring data JPA one to one mapping

Here there are two entities as Student and Address. Student is the parent entity and Address is the child entity.
Among Student and Address there is a one to one relationship. Here I have mapped that relationship as a bidirectional  relationship.
For testing these relationsip I have added  below mappings inside a rest controller called TestResource.

1.Save data     ->  @GetMapping("/save")/n
2.Retrieve data ->  @GetMapping("/retrieve")
3.Update data   ->  @GetMapping("/update")
4.Delete data   ->  @GetMapping("/delete")

