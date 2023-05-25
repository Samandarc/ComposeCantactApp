package uz.gita.composecantactapp.data.local.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import kotlinx.coroutines.flow.Flow;
import uz.gita.composecantactapp.data.local.room.entity.ContactEntity;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Luz/gita/composecantactapp/data/local/room/dao/ContactDao;", "", "add", "", "contactEntity", "Luz/gita/composecantactapp/data/local/room/entity/ContactEntity;", "delete", "retrieveAllContacts", "Lkotlinx/coroutines/flow/Flow;", "", "update", "app_debug"})
public abstract interface ContactDao {
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void add(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.local.room.entity.ContactEntity contactEntity);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.local.room.entity.ContactEntity contactEntity);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.local.room.entity.ContactEntity contactEntity);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "Select * from contacts")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.composecantactapp.data.local.room.entity.ContactEntity>> retrieveAllContacts();
}