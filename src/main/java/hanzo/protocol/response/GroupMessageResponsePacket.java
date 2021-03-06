package hanzo.protocol.response;

import hanzo.protocol.Packet;
import hanzo.session.Session;
import lombok.Data;

import static hanzo.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

/**
 * GroupMessageResponsePacket
 *
 * @author igaozp
 */
@Data
public class GroupMessageResponsePacket extends Packet {
    private String fromGroupId;
    private Session fromUser;
    private String message;

    @Override
    public Byte getCommand() {
        return GROUP_MESSAGE_RESPONSE;
    }
}
