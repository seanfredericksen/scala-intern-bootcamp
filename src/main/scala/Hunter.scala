
object Hunter {
  
  private class Medic (
  	startingHealth: Int,
  	name: String
  ) extends Hunter (startingHealth, name) {
  	val className = "Medic"

  	def healHunter(hunter: Hunter) = hunter.gainLife(20)
  }

  private class Assault (
  	startingHealth: Int,
  	name: String,
  	val armor: Int
  ) extends Hunter(startingHealth, name) {
  	val className = "Assault"

 	override def takeDamage(damage: Int) = super.takeDamage(damage - armor)
  }
  
  def medic(startingHealth: Int, name: String): Hunter = new Medic(startingHealth, name)
  def assault(startingHealth: Int, name: String, armor: Int): Hunter = new Assault(startingHealth, name, armor)

  abstract class Hunter (
    startingHealth: Int,
    val name: String
  ) {
    var currentHealth = startingHealth

    def takeDamage(damage: Int) = currentHealth -= damage
    def gainLife(life: Int) = currentHealth += life
    def isAlive = currentHealth > 0
    def className: String   
  }

}