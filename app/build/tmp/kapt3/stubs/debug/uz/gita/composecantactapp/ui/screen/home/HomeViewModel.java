package uz.gita.composecantactapp.ui.screen.home;

import androidx.lifecycle.LiveData;
import uz.gita.composecantactapp.data.model.ContactData;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/composecantactapp/ui/screen/home/HomeViewModel;", "", "contactsLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/composecantactapp/data/model/ContactData;", "getContactsLiveData", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract interface HomeViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.composecantactapp.data.model.ContactData>> getContactsLiveData();
}