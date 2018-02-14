import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.ConnectEvent;
import org.pircbotx.hooks.events.PrivateMessageEvent;
import org.pircbotx.hooks.types.GenericMessageEvent;

/*
TODO
Add a method that will create a match and invite the user to it.
 */


public class MyListener extends ListenerAdapter {
    @Override
    public void onPrivateMessage(PrivateMessageEvent event) {

        if(event.getMessage().equals("!create")) {

        }



        /*
        if(event.getUser().getNick().equals("hexxy22")) {
            event.getBot().send().message("BanchoBot", event.getMessage());
            event.getBot().send().message("hexxy22", event.getMessage());
        }

        if(event.getUser().getNick().equals("BanchoBot"))
            System.out.println(event.getMessage());

        if(event.getMessage().startsWith("_")) { //Invites hexxy22 when given a '_' followed by the lobby ID
            event.getBot().send().message("#mp_" + event.getMessage().substring(1), "!mp invite hexxy22");
        }*/
    }

    @Override
    public void onConnect(ConnectEvent event) {

    }

    public static void main(String[] args) throws Exception {
        //Configure what we want our bot to do
        Configuration configuration = new Configuration.Builder()
                .setName("Jew") //Set the nick of the bot. CHANGE IN YOUR CODE
                .addServer("irc.ppy.sh") //Join the freenode network
                .setServerPassword("c1907bb4")
                .addAutoJoinChannel("#osu")
                .addListener(new MyListener()) //Add our listener that will be called on Events
                .buildConfiguration();


        //Create our bot with the configuration
        PircBotX bot = new PircBotX(configuration);
        //Connect to the server
        bot.startBot();



    }
}