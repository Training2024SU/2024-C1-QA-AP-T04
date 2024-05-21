Feature: Consume Marvel Api services
  i as a user of the marvel api
  want to get information about the comics
  to learn about comics details

  Background:
    Given the user has access to marvel API "http://gateway.marvel.com/v1/public"

  @Services
  @Service1
  Scenario: Consult characters by a comic
    When make a GET request to the endpoint "/comics/{comicId}/characters" with parameter "comicId" valid comic ID 1749
    Then should get a status code 200
    And the answer contains the character "Apocalypse"

  @Services
  @Service2
  Scenario: Consult all the creators
    When make a GET request to the endpoint "/creators" with parameter "firstName" equal to "Stan"
    Then should obtain a status code 200
    And the answer contains a creator with last name "Lee"