/**
 *  Do not use any of these methods to solve other methods.
 *  Do not create any other methods to solve these methods.
 *  Do not change the method headers (return type, name, parameters) of these methods.
 *  Do not delete the comments from the starter code
 *  Do not use loops to solve these problems.
 *
 *  Remember: Comments describe the method that comes after them.
 */
public class ConditionDrills
{
  /** The starting point of this program.
   *
   *  Write code here to test the methods you write.
   *
   *  @param String[] args Commandline arguments.
   */
  public static void main(String[] args)
  {
    // You need to test your work! Follow this example of how to test a method:

    // This statement invokes the hello method and stores its response in the answer variable
    boolean answer = isEven(705);

    // This statement outputs the value of the answer variable to the console
    System.out.println( answer );
  }

  /**  Identify if num is even or not.
   *
   *   A number is even if it is evenly divisible by 2.
   *
   *   @param int num the number to check for evenness
   *   @return boolean true if num is even; otherwise false
   */
  public static boolean isEven(int num)
  {
    return false;
  }

  /**  Identify if num is negative or not.
   *
   *   @param int num the number to check for negativeness
   *   @return boolean true if num is negative; otherwise false
   */
  public static boolean isNegative(int num)
  {
    return false;
  }

  /**  Identify if str has no characters or not (is it empty?).
   *
   *   A String is considered empty if it has 0 characters.
   *
   *   @param String str the string to check for emptiness
   *   @return boolean true if str has no characters; otherwise false
   */
  public static boolean isEmpty(String str)
  {
    return false;
  }

  /**  Identify if str is a vowel
   *
   *  Vowels are A, E, I, O, and U
   *
   *   @param String letter The string to check for vowelness
   *   @return boolean true if str is a vowel; otherwise false
   *
   *  Precondition: str.length() == 1 and is uppercase
   */
  public static boolean isVowel(String letter)
  {
    return false;
  }

  /**  Identify whether you will answer your phone when it rings.
   *
   *  You normally answer the phone, unless it is the morning.
   *  You will answer the phone in the morning if your mom is calling.
   *  You never answer the phone if you are sleeping.
   *
   *   @param boolean isMorning true if it is morning; otherwise false
   *   @param boolean isMom true if it your mom is calling; otherwise false
   *   @param boolean isAsleep true if you are asleep; otherwise false
   *   @return boolean true if str is a vowel; otherwise false
   */
  public static boolean answerPhone(boolean isMorning, boolean isMom, boolean isAsleep)
  {
    return false;
  }

  /**  Identify if a party is a taco party.
   *
   *  A party is considered a taco party if there are between 10 and 20 tacos, inclusive.
   *  Unless it is the weekend, in which case there is no upper bound on the number of tacos.
   *  Return true if the party is a taco party, or false otherwise.
   *
   *  Examples:
   *    tacoParty(10, false) -> true
   *    tacoParty(20, false) -> true
   *    tacoParty(21, false) -> false
   *    tacoParty(15, true)  -> true
   *    tacoParty(21, true)  -> true
   *    tacoParty(5,  true)  -> false
   *
   *   @param int numTacos how many tacos are at the party
   *   @param boolean weekend true if it is the weekend, otherwise false
   *   @return boolean true if the parameters indicate that it is a taco party; otherwise false
   */
  public static boolean tacoParty(int numTacos, boolean weekend)
  {
    return false;
  }

  /**  Return the character in the middle of the string. If there are an even number of characters
   *   then return the middle 2 characters.
   *
   *  Examples:
   *    middle("Computer") -> "pu"
   *    middle("Science") -> "e"
   *
   *   @param String str the string to get the middle character from
   *   @return String a String with 1 or 2 characters from the middle of str
   *
   *  Precondition: str.length() >= 1
   */
  public static String middle(String str)
  {
    return null;
  }

  /**  Identify if all three parameters have the same ones digit
   *
   *  Examples:
   *    sameOnes(15, -25, 305) -> true
   *    sameOnes(5, 75, 500) -> false
   *
   *   @param int a a number
   *   @param int b a number
   *   @param int c a number
   *   @return boolean true if all three parameters have the same ones digit
   */
  public static boolean sameOnes(int a, int b, int c)
  {
    return false;
  }

  /**  Return the character at the specified index, or the empty string if index is out of bounds
   *
   *  Index is considered out of bounds if it is too big or too small to be a valid index
   *
   *  Examples:
   *    getLetter("tacos", 2) -> "c"
   *    getLetter("tacos", -5) -> ""
   *    getLetter("tacos", 100) -> ""
   *
   *   @param String str The string you are getting a letter out of
   *   @param int index the index of the letter you are getting from str
   *   @return String the character at the specified index, or the enpty string if index is out of bounds
   */
  public static String getLetter(String str, int index)
  {
    return false;
  }

  /**  Identify how much money a lotto number wins.
   *
   *  Rules:
   *    If all three numbers are the value 5, the ticket wins 10
   *    Othewise, if all three numbers are the same, the ticket wins 5
   *    otherwise, if b and c are different from a, the the ticket wins 1
   *    otherwise, the ticket wins 0
   *
   *   @param int a the first number
   *   @param int b the second number
   *   @param int c the third number
   *   @return int how much money this ticket wins
   */
  public static int lotto(int a, int b, int c)
  {
    return -1;
  }

  /**  Return the smallest value from a, b, and c
   *
   *  Examples:
   *    smallest(1, 2, 3) -> 1
   *    smallest(6, 2, 4) -> 2
   *    smallest(30, 20, 10) -> 10
   *
   *   @param int one the first number
   *   @param int two the second number
   *   @return int either the value of one or two, whichever is closes to 20
   */
  public static int smallest(int a, int b, int c)
  {
    return -1;
  }

  /**  Identify whether the values of a, b, and c are in increasing order.
   *
   *   Numbers are in increasing order if a < b < c
   *
   *  Examples:
   *    sorted(1, 2, 3) -> true
   *    sorted(1, 2, 2) -> false
   *    sorted(3, 2, 1) -> false
   *
   *   @param int a the first number
   *   @param int b the second number
   *   @param int c the third number
   *   @return boolean true if a < b < c; otherwise false
   */
  public static boolean sorted(int a, int b, int c)
  {
    return false;
  }

  /**  Return the String "fizz" if num is divisible by 3
   *   Return the String "buzz" if num is divisivle by 5
   *   Return the String "fizzbuzz" if num is divisible by both 3 and 5
   *   Otherwise, return a string that contains the number
   *
   *  Examples:
   *    sorted(6) -> "fizz"
   *    sorted(7) -> "7"
   *    sorted(10) -> "buzz"
   *    sorted(15) -> "fizzbuzz"
   *
   *   @param int num the number to check
   *   @return String Depending on the value of nub, return the value "fizz", "buzz", "fizzbuzz", or a numberical string value
   */
  public static String fizzbuzz(int num)
  {
    return null;
  }

  /**  Identify how good a pair of numbers is in blackjack
   *
   *  If the sum of two numbers is exactly 21, return the string "blackjack"
   *  If the sum of two numbers is greater than 21, return the string "bust"
   *  If the sum of two numbers is between 16 and 20, inclusive, return the string "stay"
   *  If the sum of two numbers is between 4 and 15 inclusive, then return the string "hit"
   *  In all other cases, return the string "cheat"
   *
   *  Examples:
   *    blackjack(10, 11) -> "blackjack"
   *    blackjack(10, 8)  -> "stay"
   *    blackjack(11, 11) -> "bust"
   *    blackjack(2, 4)   -> "hit"
   *
   *   @param int one the first number
   *   @param int two the second number
   *   @return String One of the values "blackjack", "bust", "stay", "hit", "cheat"
   */
  public static String blackjack(int one, int two)
  {
    return null;
  }

  /**  Return the value that is closes to 20. In the case of a tie, return the smaller value
   *
   *  Examples:
   *    closestTo20(19, 25) -> 19
   *    closestTo20(21, 8) -> 21
   *    closestTo20(22, 18) -> 18
   *
   *   @param int one the first number
   *   @param int two the second number
   *   @return int either the value of one or two, whichever is closes to 20
   */
  public static int closestTo20(int one, int two)
  {
    return -1;
  }

  /**  Given a number with exactly 2 digits, identify if both digits are the same
   *
   *  Examples:
   *    doubleDigits(33) -> true
   *    doubleDigits(13) -> false
   *
   *   @param int num the number to check
   *   @return int true if both digits of num are the same, otherwise false
   *
   *  Precondition num > 9 and num < 100
   */
  public static boolean doubleDigits(int num)
  {
    return false;
  }

}
