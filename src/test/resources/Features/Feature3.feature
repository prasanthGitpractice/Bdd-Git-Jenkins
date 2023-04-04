Feature: sample3

  Scenario: page title checking based on variable in DataTable
    Given open browser
    When launch site "https://www.google.co.in"
    Then search a word and click Enter key and check page title
      | word        |
      | stevejobs   |
      | magnitia    |
      | goldrate    |
      | temparature |
      | paddu       |
    When quit site