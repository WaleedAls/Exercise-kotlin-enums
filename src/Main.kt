fun main() {
    val admin = UserRole.ADMIN
    val editor = UserRole.EDITOR
    val viewer= UserRole.VIEWER

    println (haveAccessLevel(admin , 2))
    println (haveAccessLevel(editor, 2))
    println (haveAccessLevel(viewer, 2))


    for (userRole in UserRole.values()) {

       // println(userRole.accessLevel)

        println ("${userRole.name} - ${userRole.accessLevel}                 ")
    }
}

enum class UserRole (var accessLevel: Int){
    VIEWER(1),  EDITOR(2), ADMIN (3)
}

fun haveAccessLevel (userRole: UserRole , requireAccess: Int): Boolean {
    return userRole.accessLevel >= requireAccess
}




