import org.scalatest._
import org.scalatest.mockito.MockitoSugar

abstract class FlatSpecClass extends FlatSpec with Matchers with OptionValues with Inside with Inspectors with MockitoSugar with BeforeAndAfter {

}
