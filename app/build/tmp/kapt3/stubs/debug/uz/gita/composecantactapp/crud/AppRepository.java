package uz.gita.composecantactapp.crud;

import kotlinx.coroutines.flow.Flow;
import uz.gita.composecantactapp.data.model.ContactData;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Luz/gita/composecantactapp/crud/AppRepository;", "", "add", "", "contactData", "Luz/gita/composecantactapp/data/model/ContactData;", "(Luz/gita/composecantactapp/data/model/ContactData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "retrieveAllContacts", "Lkotlinx/coroutines/flow/Flow;", "", "update", "app_debug"})
public abstract interface AppRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object add(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.model.ContactData contactData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.model.ContactData contactData);
    
    public abstract void update(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.data.model.ContactData contactData);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.composecantactapp.data.model.ContactData>> retrieveAllContacts();
}