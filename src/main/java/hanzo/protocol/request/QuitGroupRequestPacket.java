package hanzo.protocol.request;

import hanzo.protocol.Packet;
import lombok.Data;

import static hanzo.protocol.command.Command.QUIT_GROUP_REQUEST;

/**
 * QuitGroupRequestPacket
 *
 * @author igaozp
 */
@Data
public class QuitGroupRequestPacket extends Packet {
    private String groupId;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_REQUEST;
    }
}
