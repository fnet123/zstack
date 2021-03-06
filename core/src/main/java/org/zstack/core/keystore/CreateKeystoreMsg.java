package org.zstack.core.keystore;

import org.zstack.header.message.NeedReplyMessage;

/**
 * Created by miao on 16-8-15.
 */
public class CreateKeystoreMsg extends NeedReplyMessage {
    private String resourceUuid;
    private String resourceType;
    private String type;
    private String content;

    public String getResourceUuid() {
        return resourceUuid;
    }

    public void setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
