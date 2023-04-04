Feature: sample1

  Scenario: GooglepageTitlechecking
    Given open browser
    When launch site "https://www.google.co.in"
    Then page title should be "google"
    When close site

  Scenario: pagetitlecheckbasedonsearch
    Given open browser
    When launch site "https://www.google.co.in"
    And search a word "abdul kalam" and click ENTER key
    Then page title should contain "abdul kalam"
    When quit site