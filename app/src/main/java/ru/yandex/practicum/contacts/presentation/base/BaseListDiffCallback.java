package ru.yandex.practicum.contacts.presentation.base;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>{

    public boolean theSameAs(T other){
        return this.hashCode() == other.hashCode();

    }
    public boolean areItemsTheSame( T oldItem,  T newItem) {
        return oldItem.theSameAs(newItem);
    }


    public boolean areContentsTheSame( T oldItem,  T newItem) {
        return oldItem.equals(newItem);
    }
    public Object getChangePayload( T oldItem,  T newItem) {
        return newItem;
    }
}