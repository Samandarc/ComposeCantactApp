package uz.gita.composecantactapp.ui.screen.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import uz.gita.composecantactapp.data.model.ContactData;
import uz.gita.composecantactapp.crud.AppRepository;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/composecantactapp/ui/screen/home/HomeViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/composecantactapp/ui/screen/home/HomeViewModel;", "repository", "Luz/gita/composecantactapp/crud/AppRepository;", "(Luz/gita/composecantactapp/crud/AppRepository;)V", "contactsLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/composecantactapp/data/model/ContactData;", "getContactsLiveData", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class HomeViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.composecantactapp.ui.screen.home.HomeViewModel {
    private final uz.gita.composecantactapp.crud.AppRepository repository = null;
    
    @javax.inject.Inject
    public HomeViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.crud.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<uz.gita.composecantactapp.data.model.ContactData>> getContactsLiveData() {
        return null;
    }
}