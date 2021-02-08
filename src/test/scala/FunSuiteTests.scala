import org.scalatest.funsuite.AnyFunSuite

class FunSuiteTests extends AnyFunSuite {

  test("Volume goes up 2") {
    Radio.reset()

    Radio.turnUp()
    Radio.turnUp()

    assert(Radio.getVolume == 2)
  }

  test("Volume goes up 2 then down 1") {
    Radio.reset()

    Radio.turnUp()
    Radio.turnUp()
    Radio.turnDown()

    assert(Radio.getVolume == 1)
  }

  test("Radio is off and gets turned on") {
    Radio.reset()

    assert(!Radio.isOn)

    Radio.turnOn()

    assert(Radio.isOn)
  }

  test("Radio is off then on then off") {
    Radio.reset()

    assert(!Radio.isOn)

    Radio.turnOn()

    assert(Radio.isOn)

    Radio.turnOff()

    assert(!Radio.isOn)
  }

}
