//1
object SupportGroup {
  def main(args: Array[String]): Unit = {
    //2
    println("Welcome to the Support Group for Trauma Survivors!")
    
    //3
    val members = List[String]()
    
    //4
    def addMember(name: String): Unit = {
      members.+=(name)
      
      //5
      println(s"Welcome, $name. You have been added to the group!")
    }
    
    //6
    def removeMember(name: String): Unit = {
      members.-=(name)
      
      //7
      println(s"We are sorry to see you go, $name. You have been removed from the group!")
    }
    
    //8
    def listMembers(): Unit = {
      println("The current members of the group are:")
      for (member <- members) {
        println(member)
      }
    }
    
    //9
    def startMeeting(): Unit = {
      //10
      println("Let's start the meeting!")
      
      //11
      println("Does anyone want to start by sharing what they're going through?")
    }
    
    //12
    def provideResources(): Unit = {
      //13
      println("We have various resources that can help you. You can find them online or through our counselors.")
      
      //14
      println("You can also reach out to other members of the group for support.")
    }
    
    //15
    def checkIn(): Unit = {
      //16
      println("Let's check in with each other to see how everyone is doing.")
      
      //17
      for (member <- members) {
        //18
        println(s"$member, how are you doing today?")
      }
    }
    
    //19
    def endMeeting(): Unit = {
      //20
      println("It's time to end the meeting. Thank you for coming and sharing your stories and experiences.")
    }
    
    //21
    def runMeeting(): Unit = {
      startMeeting()
      provideResources()
      checkIn()
      endMeeting()
    }
    
    //22
    def startMistakeMeeting(): Unit = {
      //23
      println("Let's start the meeting!")
      
      //24
      println("Does anyone want to start by talking about a mistake they made recently?")
    }
    
    //25
    def provideTips(): Unit = {
      //26
      println("We are here to provide tips and advice to help you learn from your mistakes.")
      
      //27
      println("Sharing experiences can provide insight into how to handle similar situations.")
    }
    
    //28
    def runMistakeMeeting(): Unit = {
      startMistakeMeeting()
      provideTips()
      checkIn()
      endMeeting()
    }
    
    //29
    def isMember(name: String): Boolean = {
      //30
      members.contains(name)
    }
  }
}