package uz.gita.composecantactapp.data.local.room.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import uz.gita.composecantactapp.data.local.room.entity.ContactEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ContactDao_Impl implements ContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ContactEntity> __insertionAdapterOfContactEntity;

  private final EntityDeletionOrUpdateAdapter<ContactEntity> __deletionAdapterOfContactEntity;

  private final EntityDeletionOrUpdateAdapter<ContactEntity> __updateAdapterOfContactEntity;

  public ContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfContactEntity = new EntityInsertionAdapter<ContactEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `contacts` (`id`,`firstName`,`lastName`,`phone`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ContactEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getFirstName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhone());
        }
      }
    };
    this.__deletionAdapterOfContactEntity = new EntityDeletionOrUpdateAdapter<ContactEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `contacts` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ContactEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfContactEntity = new EntityDeletionOrUpdateAdapter<ContactEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `contacts` SET `id` = ?,`firstName` = ?,`lastName` = ?,`phone` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ContactEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getFirstName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhone());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public void add(final ContactEntity contactEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfContactEntity.insert(contactEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final ContactEntity contactEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfContactEntity.handle(contactEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final ContactEntity contactEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfContactEntity.handle(contactEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<ContactEntity>> retrieveAllContacts() {
    final String _sql = "Select * from contacts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"contacts"}, new Callable<List<ContactEntity>>() {
      @Override
      public List<ContactEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final List<ContactEntity> _result = new ArrayList<ContactEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ContactEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            _item = new ContactEntity(_tmpId,_tmpFirstName,_tmpLastName,_tmpPhone);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
