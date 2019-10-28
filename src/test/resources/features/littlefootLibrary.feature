Feature: User should able to enter the data and those data stored into file

  @mt
  Scenario Outline: Verifying the data output
    Given User is on Littlefoot Library page
    And User enters "<firstName>" and "<lastName>"
    And User puts "<Title>" and "<Author>"
    And User enters "<Pages>", "<DDC>" and "<ReadStatus>"
    Then Librarian gets the report

    Examples: test data

      | firstName | lastName | Title                           | Author                  | Pages | DDC        | ReadStatus |
      | John      | White    | Presumptions of Philosophy      | Donald Daffy Duckworth  | 657   | 120.563DUC | Fully      |
      | Robert    | Smith    | Philosophical Ponderings        | Mickey and Minnie Mouse | 1200  | 125.563MOU | Partially  |
      | Mark      | Baham    | Application of Natural Sciences | Rick Sanchez            | 145   | 601.103SAN | Fully      |
      | Aron      | River    | Rented and Unread               | Solitude O’Brien        | 734   | 834.334OBR | Unread     |
