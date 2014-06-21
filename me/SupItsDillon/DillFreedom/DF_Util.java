package me.SupItsDillon.DillFreedom;

import java.util.logging.Level;
import java.util.logging.Logger;
import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

public class DF_Util
{
  private static final Logger logger = Logger.getLogger("Minecraft");

  private DF_Util()
  {
    throw new AssertionError();
  }

  public static void bcastMsg(String message)
  {
    logger.info(message);

    for (Player p : Bukkit.getOnlinePlayers())
    {
      p.sendMessage(message);
    }
  }

    catch (Exception ex)
    {
    }

    return false;
  }

  public static void log(Level level, String message)
  {
    logger.log(level, message);
  }

  public static String maskIpAddress(String address, CommandSender sender)
  {
    if (isUserSuperadmin(sender))
    {
      return address;
    }

    String[] address_parts = address.split("\\.");
    return address_parts[0] + "." + address_parts[1] + ".*.*";
  }
}
