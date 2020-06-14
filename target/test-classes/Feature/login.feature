Feature: verifying the adactin booking page

  Scenario Outline: verifying the booking details
    Given user is in adactin home page
    When user enter "<Username>" and "<Password>"
    And user fill the "<Location>","<Hotel>", "<Room Type>","<Number Of Rooms>","<checkin>","<checkout>","<no of Adults>","<no of childs>"
    And user enters the "<First Name>", "<Last Name>","<Address>", "<Credit Card Details>", "<CardType>","<Expiry Month>","<Expiry Year>", "<CVV>"
    Then user get the Booking Order Number

    Examples: 
      | Username   | Password | Location | Hotel       | Room Type | Number Of Rooms | checkin    | checkout   | no of Adults | no of childs | First Name | Last Name | Address | Credit Card Details | CardType         | Expiry Month | Expiry Year | CVV |
      | Rahuman001 | Rahuman  | Brisbane | Hotel Creek | Deluxe    | 2 - Two         | 28/02/2020 | 01/02/2020 | 3 - Three    | 1 - One      | A          | R         | kakak   |    1234567890123456 | American Express | January      |        2022 | 123 |
