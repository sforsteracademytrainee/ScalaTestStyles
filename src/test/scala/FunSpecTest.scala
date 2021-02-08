import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter

class FunSpecTest extends FunSpec with BeforeAndAfter {


  describe("A radio") {
    it("should turn on/off when toggled") {
      Radio.turnOff()
      assert(Radio.isOn() === false)
      Radio.turnOn()
      assert(Radio.isOn() === true)
    }
  }
}
