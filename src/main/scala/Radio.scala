object Radio {
  private var volume: Int = 0
  private var on: Boolean = false;

  def isOn(): Boolean = on
  def turnOn(): Unit = {on = true}
  def turnOff(): Unit = {on = false}

  def getVolume(): Int = volume
  def turnUp(): Unit = {
    if (volume < 10) volume += 1
  }
  def turnDown(): Unit = {
    if (volume > 0) volume -= 1
  }
  def reset(): Unit = {
    on = false
    volume = 0
  }
}
