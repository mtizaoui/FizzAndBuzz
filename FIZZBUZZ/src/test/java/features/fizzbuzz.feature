Feature: FizzBuzz
  Scenario: FizzBuzz to get Fizz
    Given FizzBuzz case
    When Number is 3
    Then The result is "...Fizz..."

  Scenario: FizzBuzz to get Buzz
    Given FizzBuzz case
    When Number is 5
    Then The result is "...Buzz..."

  Scenario: FizzBuzz to get FizzBuzz
    Given FizzBuzz case
    When  Number is 15
    Then The result is "...Fizz......Buzz..."

  Scenario: FizzBuzz to get 16
    Given FizzBuzz case
    When  Number is 16
    Then The result is "16"