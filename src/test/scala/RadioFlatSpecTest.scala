import org.scalatest.flatspec.AnyFlatSpec

class RadioFlatSpecTest extends AnyFlatSpec
{
  "A Radio" should "be off" in
  {
    Radio.reset()
    Radio.turnOff()
    assert(Radio.isOn() === false)
  }

  "A Radio" should "be on" in
  {
    Radio.reset()
    Radio.turnOn()
    assert(Radio.isOn() === true)
  }

  "Volume" should "go up to 1" in
  {
    Radio.reset()
    Radio.turnUp()
    assert(Radio.getVolume === 1)
  }
}