Material Calendar View
======================

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Material%20Calendar%20View-blue.svg?style=flat)](https://android-arsenal.com/details/1/1531)

![Demo Screen Capture](/images/screencast.gif)

A better looking implementation of Android's CalendarView. The goal is to have a more Material look
and feel, rather than 100% parity with the platform's implementation.

Usage
-----

1. Add `compile 'com.prolificinteractive:material-calendarview:0.2.1'` to your dependencies.
2. Add `MaterialCalendarView` into your layouts or view hierarchy.
3. Set a `OnDateChangedListener` or call `MaterialCalendarView.getSelectedDate()` when you need it.

Customization
-------------

One of the aims of this library is to be customizable. Below is an example of custom xml attributes
available.

```xml
<com.prolificinteractive.materialcalendarview.MaterialCalendarView
    android:id="@+id/calendarView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:showOtherDates="boolean"
    app:arrowColor="color"
    app:selectionColor="color"
    app:headerTextAppearance="style"
    app:dateTextAppearance="style"
    app:weekDayTextAppearance="style"
    app:weekDayStyle="enum"
    app:disabledDays="flag"
    app:startOfWeek="enum"
    />
```

### showOtherDates

By default, only days of one month are shown. If this is set `true`,
then days from the previous and next months are used to fill the empty space.
This also controls showing dates outside of the min-max range.

### arrowColor

Set the color of the arrows used to page the calendar. Black by default.

### selectionColor

Set the color of the date selector. By default this is the color set by
`?android:attr/colorPrimary` on 5.0+ or `?attr/colorPrimary` from the AppCompat library.

### headerTextAppearance

Override the text appearance of the month-year indicator at the top.

### weekDayTextAppearance

Override the text appearance of the week day indicators.

### weekDayStyle

Set the style of the week day. Can be one of `character` (first letter of the day, e.g. S, T, etc..), `abbreviated` (abbreviated forms of the days, e.g. Tue, Wed) or `full` (full versions of the day names, e.g. Sunday, Monday). `full` isn't recommended unless you reduce text size. Default is `abbreviated`.

### dateTextAppearance

Override the text appearance of the dates.

### disabledDays

Disables certain days in the week. Disabled days do not respond to clicks and are grayed out. Can be one or more of `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday` or `none`. Default is `none`.

### startOfWeek

Set the first day of the week. Can be one of `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday` or `saturday`. Default is `sunday`.

Contributing
============

Would you like to contribute? Fork us and send a pull request! Be sure to checkout our issues first.

License
=======

>Copyright 2014 Prolific Interactive
>
>Licensed under the Apache License, Version 2.0 (the "License");
>you may not use this file except in compliance with the License.
>You may obtain a copy of the License at
>
>   http://www.apache.org/licenses/LICENSE-2.0
>
>Unless required by applicable law or agreed to in writing, software
>distributed under the License is distributed on an "AS IS" BASIS,
>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
>See the License for the specific language governing permissions and
>limitations under the License.
