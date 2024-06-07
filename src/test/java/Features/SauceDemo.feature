@SauceDemo
  Feature: SauceDemo Check Test Case

    @AllEmpty
    Scenario Outline: Empty Username & Empty Password
      Given User at home page
      When Click Login button
      Then Check "<error>" message about username
      Examples:
      |error                    |
      |Username is required     |


    @EmptyPassword
    Scenario Outline: Empty Password
      Given User at home page
      When write "<username>" for username field
      When Click Login button
      Then Check "<error>" message about password
      Examples:
      |username       ||error                 |
      |abcdef         ||Password is required  |

    @EmptyUsername
    Scenario Outline: Empty Username
      Given User at home page
      When write "<password>" for password field
      When Click Login button
      Then Check "<error>" message about username
      Examples:
      |password       ||error                 |
      |123456         ||Username is required  |

    @FalseLogin
    Scenario Outline: Correct Username & False Password
      Given User at home page
      When write correct "<username>" for username field
      When write false "<password>" for password field
      When Click Login button
      Then Check "<error>" message about don't match
      Examples:
      |username         ||password ||error|
      |standard_user    ||abc1234   ||Username and password do not match any user in this service |

    @FalseLogin2
    Scenario Outline: False Username & Correct Password
      Given User at home page
      When write false "<username>" for username field
      When write correct "<password>" for password field
      When Click Login button
      Then Check "<error>" message about don't match
      Examples:
      |username ||password    ||error    |
      |abcdef   ||secret_sauce||Username and password do not match any user in this service         |