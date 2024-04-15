import org.scalatest.funsuite.AnyFunSuite

class PrimeNumberTestSuite extends AnyFunSuite {
  // Import the nthPrime function from PrimeNumber object
  import PrimeNumber.nthPrime

  test("nthPrime function should return correct prime numbers") {
    assert(nthPrime(1) == 2)
    assert(nthPrime(2) == 3)
    assert(nthPrime(5) == 11)
    assert(nthPrime(10) == 29)
    assert(nthPrime(20) == 71)
  }

  test("nthPrime function should return -1 for invalid input") {
    assert(nthPrime(0) == -1)
    assert(nthPrime(-1) == -1)
  }
}
