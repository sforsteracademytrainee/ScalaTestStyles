import org.scalatest.funspec.AnyFunSpec
import org.scalatest.BeforeAndAfter

class FunSpecTest extends AnyFunSpec {
  describe("A radio") {
    it("should turn on/off when toggled") {
      Radio.turnOff()
      assert(Radio.isOn() === false)
      Radio.turnOn()
      assert(Radio.isOn() === true)
    }
    it("should have it's volume increased by 1") {
      var volume = Radio.getVolume()
      Radio.turnUp()
      assert(volume == (Radio.getVolume() + 1))
    }
  }
}
