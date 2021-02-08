
class FunSuiteTests extends FunSweetClass {

  test("Volume goes up 2") {
    Radio reset()

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

    Radio.turnOn()

    assert(Radio.isOn)
  }

}
