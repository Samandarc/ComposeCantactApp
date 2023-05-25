package uz.gita.composecantactapp.crud;

import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import uz.gita.composecantactapp.data.local.room.dao.ContactDao;
import uz.gita.composecantactapp.data.model.ContactData;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Luz/gita/composecantactapp/crud/AppRepositoryImpl;", "Luz/gita/composecantactapp/crud/AppRepository;", "dao", "Luz/gita/composecantactapp/data/local/room/dao/ContactDao;", "(Luz/gita/composecantactapp/data/local/room/dao/ContactDao;)V", "getDao", "()Luz/gita/composecantactapp/data/local/room/dao/ContactDao;", "add", "", "contactData", "Luz/gita/composecantactapp/data/model/ContactData;", "(Luz/gita/composecantactapp/data/model/ContactData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "retrieveAllContacts", "Lkotlinx/coroutines/flow/Flow;", "", "update", "app_debug"})
public final class AppRepositoryImpl implements uz.gita.composecantactapp.crud.AppRepository {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.composecantactapp.data.local.room.dao.ContactDao dao = null;
    
    @javax.inject.Inject
    public AppRepositoryImpl(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.local.room.dao.ContactDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.composecantactapp.data.local.room.dao.ContactDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object add(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.model.ContactData contactData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override
    public void delete(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.model.ContactData contactData) {
    }
    
    @java.lang.Override
    public void update(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.model.ContactData contactData) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.composecantactapp.data.model.ContactData>> retrieveAllContacts() {
        return null;
    }
}