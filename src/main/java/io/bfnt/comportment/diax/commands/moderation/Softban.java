package io.bfnt.comportment.diax.commands.moderation;

import io.bfnt.comportment.diax.api.command.CommandDescription;
import io.bfnt.comportment.diax.api.command.DiaxCommand;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Message;

/**
 * Created by Comporment on 25/03/2017 at 09:23
 * Dev'ving like a sir since 1998. | https://github.com/Comportment
 */
@CommandDescription(guildOnly = true, minimumArgs = 1, permission = Permission.KICK_MEMBERS, name = "softban", emoji = "🔨")
public class Softban extends DiaxCommand
{
    public void execute(Message trigger)
    {

    }
}