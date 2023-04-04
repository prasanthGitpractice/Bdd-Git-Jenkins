Feature: sample1
	
  @smokeTest
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

  @RealTest
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
