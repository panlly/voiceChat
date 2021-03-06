package com.example.administrator.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.administrator.oldvoicechat.VoiceMsg;

import com.example.administrator.greendao.VoiceMsgDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig voiceMsgDaoConfig;

    private final VoiceMsgDao voiceMsgDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        voiceMsgDaoConfig = daoConfigMap.get(VoiceMsgDao.class).clone();
        voiceMsgDaoConfig.initIdentityScope(type);

        voiceMsgDao = new VoiceMsgDao(voiceMsgDaoConfig, this);

        registerDao(VoiceMsg.class, voiceMsgDao);
    }
    
    public void clear() {
        voiceMsgDaoConfig.clearIdentityScope();
    }

    public VoiceMsgDao getVoiceMsgDao() {
        return voiceMsgDao;
    }

}
