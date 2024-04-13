object PrimeNumber extends App{
  def nthPrime(n: Int): Int = {
    if (n <= 0) return -1
    var count = 0
    var num = 2

    def checkPrime(num: Int): Boolean = {
      if (num <= 1) return false
      if (num <= 3) return true
      if (num % 2 == 0 || num % 3 == 0) return false
      var i = 5
      while (i * i <= num) {
        if (num % i == 0 || num % (i + 2) == 0) return false
        i += 6
      }
      true
    }
    while (count < n) {
      if (checkPrime(num)) {
        count += 1
        if (count == n) return num
      }
      num += 1
    }
    -1
  }

  val res1 = 5
  val prime1 = PrimeNumber.nthPrime(res1)
  println(s"The $res1-th prime number is $prime1")

  val res2 = 7

  val prime2 = PrimeNumber.nthPrime(res2)
  println(s"The $res2-th prime number is $prime2")
}
