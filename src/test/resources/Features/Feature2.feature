Feature: sample2

  Scenario Outline: page title checking based on variable in example:
    Given open browser
    When launch site "https://www.google.co.in"
    And search "<word>" and click ENTER key
    Then page title should contain "<word>"
    When quit site

    Examples: 
      | word        |
      | stevejobs   |
      | magnitia    |
      | goldrate    |
      | temparature |
      | paddu       |
