# software-engineering-lab-session5

  | `Person Number` | `First Name` | `Last Name` | `Student Number` |
  |:---------------:|:------------:|:-----------:|:----------------:|
  | `First Person` | Moahmmad Taha | Jahani-Nezhad | 98101363  |
  | `Second Person` | Iman | Alipour | 98102024 |
  
---
# مراحل انجام آزمایش

در این آزمایش می‌خواهیم TDD را انجام دهیم. بنابراین طبق دستورکار، ابتدا باید نیازمندی‌های پروژه را در قالب تست‌هایی بنویسیم.

برای استخراج نیازمندی‌ها، مراحل انجام آزمایش را به دقت مطالعه می‌کنیم و تلاش می‌کنیم تمامی خواسته‌های این آزمایش را به ترتیب بنویسیم:

- یک کلاس مستطیل داریم که می‌توان با یک طول و عرض مشخص آن‌را تعریف کرد.
- هر شی مستطیل باید قابلیتی محاسبه‌ی مساحت خود را داشته باشد.
- می‌خواهیم امکان تغییر ابعاد مستطیل را داشته باشیم.
- یک کلاس مربع داریم که می‌توان آن‌را با مشخص کردن اندازه‌ی ضلع تعریف کرد.
- هر شی مربع باید قابلیت محاسبه‌ی مساحت خود را داشته باشد.
- می‌خواهیم امکان تغییر اندازه‌ی ضلع یک مربع را داشته باشیم.

با توجه به این نیازمندی‌ها، تست‌های جداگانه‌ای را برای کلاس‌های مربع و مستطیل می‌نویسیم. این کلاس‌ها در آدرس `/src/test/main` قرار دارند.

# پرسش‌ها
## پرسش ۱: هر یک از پنج اصل SOLID را در دو الی سه خط توضیح دهید.

اصل Single Responsibility Principle (SRP) به معنای اصل مسئولیت تکی است و به این معناست که هر کلاس باید فقط یک مسئولیت داشته باشد. (در واقع باید فقط به یک actor جواب بدهد، در غیر این صورت coupling در کد زیاد می‌شود و ممکن است در آینده حین تغییراتی که در کد نیاز است مشکلاتی بوجود بیاید.)

اصل Open-Closed Principle (OCP) به معنای اصل باز-بسته بودن است و به این معناست که کلاس‌ها باید برای تغییرات بسته باشند، اما برای توسعه باز باشند.

اصل Liskov Substitution Principle (LSP) به معنای اصل جایگزینی لیسکوف است و به این معناست که هر شیء قابل جایگزینی با شیء از کلاس پایه خود باشد، بدون اینکه کارکرد برنامه تغییر کند.

اصل Interface Segregation Principle (ISP) به معنای اصل جداسازی رابط(اینترفیس) است و به این معناست که چندین واسط یک هر کدام یک کار را انجام می‌دهند از یک واسط که چندین کار را انجام می‌دهد بهتر است.

اصل Dependency Inversion Principle (DIP) یا اصل وارونه کردن وابستگی است که به معنای این است که باید برنامه‌ها به گونه‌ای طراحی شوند که وابستگی به کلاس‌های پایین‌تر در سلسله مراتب کاهش یابد و برعکس، کلاس‌های بالاتر در سلسله مراتب به کلاس‌های پایین‌تر وابستگی نداشته باشند. 

## پرسش ۲: اصول SOLID در کدام یک از گام‌های اصلی ایجاد نرم‌افزار (تحلیل نیازمندی‌ها، طراحی، پیاده‌سازی، تست و استقرار) استفاده می‌شوند؟ توضیح دهید.

اصول SOLID در تمامی گام‌های ایجاد نرم‌افزار (تحلیل نیازمندی‌ها، طراحی، پیاده‌سازی، تست و استقرار) مورد استفاده قرار می‌گیرند. در گام تحلیل نیازمندی‌ها، این اصول به طور کلی برای طراحی سیستم‌هایی با قابلیت توسعه و نگهداری مناسب مورد استفاده قرار می‌گیرند. در گام طراحی، این اصول برای طراحی ساختار کد و ایجاد رابط‌های مناسب بین کلاس‌ها و ماژول‌ها مورد استفاده قرار می‌گیرند. در گام پیاده‌سازی، این اصول برای پیاده‌سازی کد با کیفیت و قابلیت توسعه و نگهداری مناسب مورد استفاده قرار می‌گیرند. در گام تست، این اصول برای طراحی تست‌های مناسب و ایجاد کد با قابلیت تست مناسب مورد استفاده قرار می‌گیرند. در گام استقرار، این اصول برای ایجاد سیستم‌هایی با قابلیت نگهداری و توسعه مناسب مورد استفاده قرار می‌گیرند.

## پرسش ۳: معمولاً گام تست در پایان روند ایجاد نرم‌افزار انجام می‌شود، اما در روش TDD تست‌نویسی پیش از پیاده‌سازی شروع می‌شود. آیا این دو مورد با هم تناقضی دارند؟ توضیح دهید.

در روش TDD، تست‌ها قبل از پیاده‌سازی نوشته می‌شوند و پس از آن کد پیاده‌سازی می‌شود. این روش به منظور افزایش کیفیت کد و کاهش احتمال وجود باگ‌ها و خطاها در نرم‌افزار استفاده می‌شود. بنابراین، این روش با گام تست در پایان روند ایجاد نرم‌افزار تناقضی ندارد، بلکه به عنوان یک روش جایگزین برای افزایش کیفیت کد و کاهش احتمال وجود باگ‌ها و خطاها مورد استفاده قرار می‌گیرد.

## پرسش ۴: فرض کنید در آزمایش بالا نیازی به تغییر ابعاد مستطیل نداشتیم. در این حالت طراحی مدل‌ها چه تفاوتی می‌کند؟

در صورتی که در آزمایش بالا نیازی به تغییر ابعاد مستطیل نباشد، بهتر است در طراحی مدل‌ها تفاوت چندانی نداشته باشیم. (چون می‌خواهیم طبق اصول SOLID عمل کنیم.) در حالت اول که ابعاد مستطیل امکان تغییر داشتند، اینکه مربع از مستطیل ارث‌بری کند اصل Substitution Principle (LSP) را نقض می‌کرد چرا که در مستطیل رفتاری متفاوت از رفتار مربع در مورد تعیین طول و عرض داشتیم، اما با این نیازمندی جدید که ابعاد مستطیل تغییر نمی‌کنند اگر مربع از مستطیل ارث‌بری کند این مشکل را نخواهیم داشت و بنابراین امکان این وجود دارد که این کار را انجام بدهیم، اما آیا یک مربع واقعا مستطیل است؟ برای مستطیل نیاز به دو فیلد برای طول و عرض داریم اما برای مربع فقط به یک متغیر برای مشخص کردن طول ضلع آن، حال اما اگر مربع از مستطیل ارث‌بری کند برای هر مربع باید یک فیلد اضافه‌تر نگه داریم که بهینه نیست و ممکن است در ادامه مشکلاتی برای ما ایجاد کند، بنابراین در این حالت همچنان با اینکه امکان ارث‌بری وجود دارد اما بهتر است مربع از مستطیل ارث‌بری نکند. 