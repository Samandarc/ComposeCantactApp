package uz.gita.composecantactapp.ui.screen.addcontact.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import uz.gita.composecantactapp.data.model.ContactData;
import uz.gita.composecantactapp.crud.AppRepository;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/composecantactapp/ui/screen/addcontact/viewmodel/AddContactViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/composecantactapp/ui/screen/addcontact/viewmodel/AddContactViewModel;", "repository", "Luz/gita/composecantactapp/crud/AppRepository;", "(Luz/gita/composecantactapp/crud/AppRepository;)V", "addContact", "", "fname", "", "lname", "phone", "app_debug"})
public final class AddContactViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.composecantactapp.ui.screen.addcontact.viewmodel.AddContactViewModel {
    private final uz.gita.composecantactapp.crud.AppRepository repository = null;
    
    @javax.inject.Inject
    public AddContactViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.crud.AppRepository repository) {
        super();
    }
    
    @java.lang.Override
    public void addContact(@org.jetbrains.annotations.NotNull
    java.lang.String fname, @org.jetbrains.annotations.NotNull
    java.lang.String lname, @org.jetbrains.annotations.NotNull
    java.lang.String phone) {
    }
}