class RadioFlatSpecTest extends FlatSpecClass
{
  "A Radio" should "be off" in
  {
    Radio.turnOff()
    assert(Radio.isOn() === false)
  }

  "A Radio" should "be on" in
  {
    Radio.turnOn()
    assert(Radio.isOn() === true)
  }

  "Volume" should "go up to 2" in
  {
    Radio.reset()
    Radio.turnUp()
    assert(Radio.getVolume() === 2)
  }
}