package com.example.administrator.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.oldvoicechat.VoiceMsg;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VOICE_MSG".
*/
public class VoiceMsgDao extends AbstractDao<VoiceMsg, Long> {

    public static final String TABLENAME = "VOICE_MSG";

    /**
     * Properties of entity VoiceMsg.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Time = new Property(1, long.class, "time", false, "TIME");
        public final static Property FilePath = new Property(2, String.class, "filePath", false, "FILE_PATH");
        public final static Property VoiceTime = new Property(3, float.class, "voiceTime", false, "VOICE_TIME");
        public final static Property Deriction = new Property(4, int.class, "deriction", false, "DERICTION");
        public final static Property Name = new Property(5, String.class, "name", false, "NAME");
    }


    public VoiceMsgDao(DaoConfig config) {
        super(config);
    }
    
    public VoiceMsgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VOICE_MSG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TIME\" INTEGER NOT NULL ," + // 1: time
                "\"FILE_PATH\" TEXT," + // 2: filePath
                "\"VOICE_TIME\" REAL NOT NULL ," + // 3: voiceTime
                "\"DERICTION\" INTEGER NOT NULL ," + // 4: deriction
                "\"NAME\" TEXT);"); // 5: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VOICE_MSG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VoiceMsg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getTime());
 
        String filePath = entity.getFilePath();
        if (filePath != null) {
            stmt.bindString(3, filePath);
        }
        stmt.bindDouble(4, entity.getVoiceTime());
        stmt.bindLong(5, entity.getDeriction());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(6, name);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VoiceMsg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getTime());
 
        String filePath = entity.getFilePath();
        if (filePath != null) {
            stmt.bindString(3, filePath);
        }
        stmt.bindDouble(4, entity.getVoiceTime());
        stmt.bindLong(5, entity.getDeriction());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(6, name);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public VoiceMsg readEntity(Cursor cursor, int offset) {
        VoiceMsg entity = new VoiceMsg( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getLong(offset + 1), // time
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // filePath
            cursor.getFloat(offset + 3), // voiceTime
            cursor.getInt(offset + 4), // deriction
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // name
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VoiceMsg entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTime(cursor.getLong(offset + 1));
        entity.setFilePath(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setVoiceTime(cursor.getFloat(offset + 3));
        entity.setDeriction(cursor.getInt(offset + 4));
        entity.setName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(VoiceMsg entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(VoiceMsg entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(VoiceMsg entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}